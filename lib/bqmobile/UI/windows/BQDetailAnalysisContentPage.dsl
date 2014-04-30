<?xml version="1.0" encoding="UTF-8"?>

<window id="BQDetailAnalysisContentPage" context="AnalysisTopic" controller="BQDetailAnalysisContentPageController" namespace="com.yonyou.uap">
    <import ref="BQDetailAnalysisContentPage.css" type="css"/>
    <action id="onBackForward" isDataCollect="true" method="onBackForward"/>
    <import ref="BQAnalysisTopicRowWidget.w" type="widget"/>
    <div id="viewPage0">
        <toolbar id="toolbar0">
            <input id="imagebuttonBack" istogglebutton="false" onclick="onBackForward" type="imagebutton" checked="false"/>
            <input id="imagebutton1" istogglebutton="false" type="imagebutton" checked="false"/>
            <label id="label0">功能主题列表</label>
            <input id="imagebutton4" istogglebutton="false" type="imagebutton" checked="false"/> 
        </toolbar>
        <listView id="listview0" childIndicator="BQAnalysisTopicRowWidget">
            <widget id="listview0_childWgt0" ref="BQAnalysisTopicRowWidget"/>
        </listView>
        <toolbar id="toolbar1">
            <input id="imagebutton0" istogglebutton="false" type="imagebutton" checked="false"/>
            <input id="imagebutton2" istogglebutton="false" type="imagebutton" checked="false"/>
            <input id="imagebutton3" istogglebutton="false" type="imagebutton" checked="false"/>
            <input id="imagebutton5" istogglebutton="false" type="imagebutton" checked="false"/>
            <input id="imagebutton6" istogglebutton="false" type="imagebutton" checked="false"/> 
        </toolbar> 
    </div> 
</window>
