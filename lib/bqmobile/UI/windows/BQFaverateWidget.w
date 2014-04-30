<?xml version="1.0" encoding="UTF-8"?>

<region id="region1">
    <import ref="BQFaverateWidget.css" type="css"/>
    <import ref="BQAnalysisTopicRowsWidget.w" type="widget"/>
    <import ref="BQTabMenuWidget.w" type="widget"/>
    <widget-define id="BQFaverateWidget" name="我的关注" context="AnalysisTopic">
        <div id="panel0">
            <toolbar id="toolbar0">
                <input id="imagebutton0" istogglebutton="false" type="imagebutton" checked="false"/>
                <label id="label0">我的工作区</label>
                <input id="imagebutton1" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton4" istogglebutton="false" type="imagebutton" checked="false"/> 
            </toolbar>
            <listView id="listview0" bindfield="topics" childIndicator="BQAnalysisTopicRowsWidget" onload="onLoadData" syncContext="topics">
                <widget id="listview0_childWgt0" ref="BQAnalysisTopicRowsWidget"/> 
            </listView>
            <widget id="widget0" ref="BQTabMenuWidget"/> 
        </div> 
    </widget-define> 
</region>
