<?xml version="1.0" encoding="UTF-8"?>

<window id="BQFramePage" context="AnalysisTopic" controller="BQFramePageController" namespace="com.yonyou.uap">
    <import ref="BQFramePage.css" type="css"/>
    <import ref="BQFaverateWidget.w" type="widget"/>
    <import ref="BQTabMenuWidget.w" type="widget"/>
    <action id="onClickTopics" viewid="com.yonyou.uap.BQDetailAnalysisContentPage" method="UMView.open" isKeep="false" animation-type="Fade"/>
    <action id="onLoadData" viewid="com.yonyou.uap.AnalysisTopicExtendController" action="load" callback="jsCallbackLoadData" method="UMService.callAction" autoDataBinding="true"/>
    <action id="onOpenMyWorksheet" method="onOpenMyWorksheet"/>
    <action id="onOpenAllWorksheet" method="onOpenAllWorksheet"/>
    <action id="jsCallbackLoadData" method="jsCallbackLoadData"/>
    <div id="viewPage0">
        <div id="panel0">
            <widget id="widget0" ref="BQFaverateWidget"/> 
        </div> 
    </div> 
</window>
