<?xml version="1.0" encoding="UTF-8"?>

<region id="region1">
    <import ref="BQAllTopicWidget.css" type="css"/>
    <import ref="BQAnalysicTopicGroupWidget.w" type="widget"/>
    <import ref="BQAnalysisTopicRowWidget.w" type="widget"/>
    <import ref="BQTabMenuWidget.w" type="widget"/>
    <widget-define id="BQAllTopicWidget" context="AnalysisTopic">
        <div id="panel0">
            <toolbar id="toolbar0">
                <input id="imagebutton0" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton1" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton2" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton3" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton4" istogglebutton="false" type="imagebutton" checked="false"/> 
            </toolbar>
            <listView id="listview0" bindfield="topics,childrows" childIndicator="BQAnalysisTopicRowWidget" syncContext="listview0topics_childrows" groupIndicator="BQAnalysisTopicGroupWidget">
                <widget id="listview0_groupWgt" ref="BQAnalysisTopicGroupWidget"/>
                <widget id="listview0_childWgt0" ref="BQAnalysisTopicRowWidget"/>
            </listView>
            <widget id="widget0" ref="BQTabMenuWidget"/> 
        </div> 
    </widget-define> 
</region>
