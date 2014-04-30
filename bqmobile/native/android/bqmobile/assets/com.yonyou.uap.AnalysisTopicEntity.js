Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.AnalysisTopicEntity = function(tag) {
    //Step 1：call base method and initialize the define of context
    com.yonyou.uap.AnalysisTopicEntity.initializeBase(this,[tag]);
    $um$initEntity(this, "AnalysisTopic", {"tag":"context","attributes":{"id":"AnalysisTopic","iscascade":"false","from-type":"context","filter":""},"fields":{"topics":{"tag":"fieldset","attributes":{"id":"topics","child-field":"","iscascade":"false","relation":"n","fullclassname":"","from":"TopicRow","type":"","parent-field":"","from-type":"context"},"fields":{"id":{"tag":"field","attributes":{"id":"id","type":"string"}},"name":{"tag":"field","attributes":{"id":"name","type":"string"}},"childrows":{"tag":"fieldset","attributes":{"id":"childrows","child-field":"","iscascade":"false","relation":"n","fullclassname":"","from":"TopicChildRow","type":"","parent-field":"","from-type":"context"},"fields":{"id":{"tag":"field","attributes":{"id":"id","type":"string"}},"dsl":{"tag":"field","attributes":{"id":"dsl","type":"Blob"}},"name":{"tag":"field","attributes":{"id":"name","type":"string"}},"note":{"tag":"field","attributes":{"id":"note","type":"string"}}},"namespace":"com.yonyou.uap"},"note":{"tag":"field","attributes":{"id":"note","type":"string"}}},"namespace":"com.yonyou.uap"}},"namespace":"com.yonyou.uap"});
}
function com$yonyou$uap$AnalysisTopicEntity$get_topics(){
    return this.field('topics');
}
function com$yonyou$uap$AnalysisTopicEntity$set_topics(value){
    return this.field('topics',value);
}
com.yonyou.uap.AnalysisTopicEntity.prototype = {
    get_topics : com$yonyou$uap$AnalysisTopicEntity$get_topics,
    set_topics : com$yonyou$uap$AnalysisTopicEntity$get_topics
}
com.yonyou.uap.AnalysisTopicEntity.registerClass('com.yonyou.uap.AnalysisTopicEntity',UMP.UI.Mvc.Entity);
