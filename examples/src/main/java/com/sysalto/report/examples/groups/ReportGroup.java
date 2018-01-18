package com.sysalto.report.examples.groups;

import com.sysalto.render.PdfNativeFactory;
import com.sysalto.report.Report;
import com.sysalto.report.reportTypes.Group;
import com.sysalto.report.reportTypes.GroupUtil;
import com.sysalto.report.reportTypes.RText;
import com.sysalto.report.reportTypes.ReportPageOrientation;
import com.sysalto.report.util.GroupUtilDefs;
import com.sysalto.report.util.IteratorGroup;
import com.sysalto.report.util.PdfFactory;
import scala.runtime.BoxedUnit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReportGroup {
    private PdfFactory pdfITextFactory = new PdfNativeFactory();

    private void run() throws Exception {
        Report report = Report.create("ReportGroupJava.pdf", ReportPageOrientation.LANDSCAPE(), pdfITextFactory);
        List<Food> foodList = new ArrayList<Food>();
        for (int i = 1; i < 100; i++) {
            Food food = new Food("name" + i, i, i / 10);
            foodList.add(food);
        }
        IteratorGroup<Food> grp = GroupUtilDefs.toGroup(foodList.iterator());
        GroupUtil<Food> reportGroupUtil=GroupUtil.apply(new Group<Food>("categ", food -> food.getCategory()));
        grp.foreachJ(rec->{
            report.nextLine();
            Food crtRec = GroupUtil.getRec(rec);
            if (GroupUtil.isFirstRecord(rec)) {
                report.print(new RText("FIRST")).at(100);
                report.nextLine();
            }
            if (reportGroupUtil.isHeader("categ",rec)) {
                report.print(new RText("Header categ:"+crtRec.getCategory())).at(10);
                report.nextLine();
            }
            report.print(new RText(crtRec.getName())).at(50);
            report.print(new RText(crtRec.getPrice().toString())).at(100);
            report.nextLine();
            if (reportGroupUtil.isFooter("categ",rec)) {
                report.print(new RText("Footer categ:"+crtRec.getCategory())).at(10);
                report.nextLine();
            }
            if (GroupUtil.isLastRecord(rec)) {
                report.print(new RText("LAST")).at(100);
                report.nextLine();
            }
            if (report.lineLeft()<5) {
                report.nextPage();
            }
        });
        report.render();
    }

    public static void main(String[] args) throws Exception {
        new ReportGroup().run();
    }
}

class Food {
    private String name;
    private Integer price;
    private Integer category;

    public Food(String name, Integer price, Integer category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
