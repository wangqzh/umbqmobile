<?xml version="1.0" encoding="UTF-8"?>

<region id="region1">
    <import ref="BQMenuView.css" type="css"/>
    <widget-define id="BQMenuView" name="侧边栏目录" describe="侧边栏目录" context="analysistopicitem">
        <div id="panel0">
            <input id="buttonUserInfo" value="用户信息" type="button"/>
            <input id="buttonSyset" value="系统设置" type="button"/>
            <listView id="listviewAnalysis" childIndicator="BQAnalysisTopicRow" alternatingRow="true">
                <widget id="listviewAnalysis_childWgt0" ref="BQAnalysisTopicRow"/> 
            </listView> 
        </div> 
    </widget-define>
    <input id="button0" value="用户信息" type="button"/>
    <input id="button1" value="系统设置" type="button"/>
    <listView id="listview0"/> 
</region>
