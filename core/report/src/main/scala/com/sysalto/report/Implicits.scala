/*
 * ReactiveReports - Free Java /Scala Reporting Library.
 * Copyright (C) 2017 SysAlto Corporation. All rights reserved.
 *
 * This program is part of ReactiveReports.
 *
 * ReactiveReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ReactiveReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY. Without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ReactiveReports.
 * If not, see https://www.gnu.org/licenses/lgpl-3.0.en.html.
 */




package com.sysalto.report

import com.sysalto.report.util.ReportColumnUtil

object Implicits extends ScalaReportUtil {
	val RText: com.sysalto.report.reportTypes.RText.type = com.sysalto.report.reportTypes.RText
	val LineDashType: com.sysalto.report.reportTypes.LineDashType.type = com.sysalto.report.reportTypes.LineDashType
	val RMargin: com.sysalto.report.reportTypes.RMargin.type = com.sysalto.report.reportTypes.RMargin
	val ReportRow: com.sysalto.report.reportTypes.ReportRow.type = com.sysalto.report.reportTypes.ReportRow
	val Column: com.sysalto.report.reportTypes.Column.type = com.sysalto.report.reportTypes.Column
	val Flex: ReportColumnUtil.Flex.type = ReportColumnUtil.Flex
	val ReportCell: com.sysalto.report.reportTypes.ReportCell.type = com.sysalto.report.reportTypes.ReportCell
	val Report: com.sysalto.report.Report.type = com.sysalto.report.Report
	type Report = com.sysalto.report.Report
	val ReportCellList: com.sysalto.report.reportTypes.ReportCellList.type = com.sysalto.report.reportTypes.ReportCellList
	val ReportCheckpoint: ReportTypes.ReportCheckpoint.type = com.sysalto.report.ReportTypes.ReportCheckpoint
	type ReportCheckpoint = com.sysalto.report.ReportTypes.ReportCheckpoint
	val ReportCut: ReportTypes.ReportCut.type = com.sysalto.report.ReportTypes.ReportCut
	type ReportItem = com.sysalto.report.ReportTypes.ReportItem
	val RColor: com.sysalto.report.reportTypes.RColor.type = com.sysalto.report.reportTypes.RColor


	val Await: scala.concurrent.Await.type = scala.concurrent.Await
	val Duration: scala.concurrent.duration.Duration.type = scala.concurrent.duration.Duration
	val Group: com.sysalto.report.reportTypes.Group.type = com.sysalto.report.reportTypes.Group
	type GroupUtil[T,R] = com.sysalto.report.reportTypes.GroupUtil[T,R]
}
