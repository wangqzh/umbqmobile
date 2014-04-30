Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.AnalysisTopic = function(id, entity, json) {
    //Step 1：call base method and initialize context object
    com.yonyou.uap.AnalysisTopic.initializeBase(this,[id, entity, json]);
    
}
function com$yonyou$uap$AnalysisTopic$get_topics(){
    return this.get('topics');
}
function com$yonyou$uap$AnalysisTopic$set_topics(value){
    return this.set('topics',value);
}
com.yonyou.uap.AnalysisTopic.prototype = {
    get_topics : com$yonyou$uap$AnalysisTopic$get_topics,
    set_topics : com$yonyou$uap$AnalysisTopic$get_topics
}
com.yonyou.uap.AnalysisTopic.registerClass('com.yonyou.uap.AnalysisTopic',UMP.UI.Mvc.Context);

Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.TopicRow = function(id, entity, json) {
    //Step 1：call base method and initialize context object
    com.yonyou.uap.TopicRow.initializeBase(this,[id, entity, json]);
    
}
function com$yonyou$uap$TopicRow$get_id(){
    return this.get('id');
}
function com$yonyou$uap$TopicRow$set_id(value){
    return this.set('id',value);
}
function com$yonyou$uap$TopicRow$get_name(){
    return this.get('name');
}
function com$yonyou$uap$TopicRow$set_name(value){
    return this.set('name',value);
}
function com$yonyou$uap$TopicRow$get_note(){
    return this.get('note');
}
function com$yonyou$uap$TopicRow$set_note(value){
    return this.set('note',value);
}
function com$yonyou$uap$TopicRow$get_childrows(){
    return this.get('childrows');
}
function com$yonyou$uap$TopicRow$set_childrows(value){
    return this.set('childrows',value);
}
com.yonyou.uap.TopicRow.prototype = {
    get_id : com$yonyou$uap$TopicRow$get_id,
    set_id : com$yonyou$uap$TopicRow$get_id,
    get_name : com$yonyou$uap$TopicRow$get_name,
    set_name : com$yonyou$uap$TopicRow$get_name,
    get_note : com$yonyou$uap$TopicRow$get_note,
    set_note : com$yonyou$uap$TopicRow$get_note,
    get_childrows : com$yonyou$uap$TopicRow$get_childrows,
    set_childrows : com$yonyou$uap$TopicRow$get_childrows
}
com.yonyou.uap.TopicRow.registerClass('com.yonyou.uap.TopicRow',UMP.UI.Mvc.Context);

Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.TopicChildRow = function(id, entity, json) {
    //Step 1：call base method and initialize context object
    com.yonyou.uap.TopicChildRow.initializeBase(this,[id, entity, json]);
    
}
function com$yonyou$uap$TopicChildRow$get_id(){
    return this.get('id');
}
function com$yonyou$uap$TopicChildRow$set_id(value){
    return this.set('id',value);
}
function com$yonyou$uap$TopicChildRow$get_name(){
    return this.get('name');
}
function com$yonyou$uap$TopicChildRow$set_name(value){
    return this.set('name',value);
}
function com$yonyou$uap$TopicChildRow$get_note(){
    return this.get('note');
}
function com$yonyou$uap$TopicChildRow$set_note(value){
    return this.set('note',value);
}
function com$yonyou$uap$TopicChildRow$get_dsl(){
    return this.get('dsl');
}
function com$yonyou$uap$TopicChildRow$set_dsl(value){
    return this.set('dsl',value);
}
com.yonyou.uap.TopicChildRow.prototype = {
    get_id : com$yonyou$uap$TopicChildRow$get_id,
    set_id : com$yonyou$uap$TopicChildRow$get_id,
    get_name : com$yonyou$uap$TopicChildRow$get_name,
    set_name : com$yonyou$uap$TopicChildRow$get_name,
    get_note : com$yonyou$uap$TopicChildRow$get_note,
    set_note : com$yonyou$uap$TopicChildRow$get_note,
    get_dsl : com$yonyou$uap$TopicChildRow$get_dsl,
    set_dsl : com$yonyou$uap$TopicChildRow$get_dsl
}
com.yonyou.uap.TopicChildRow.registerClass('com.yonyou.uap.TopicChildRow',UMP.UI.Mvc.Context);

