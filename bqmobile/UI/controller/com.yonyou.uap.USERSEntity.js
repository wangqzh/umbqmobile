Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.USERSEntity = function(tag) {
    //Step 1：call base method and initialize the define of context
    com.yonyou.uap.USERSEntity.initializeBase(this,[tag]);
    $um$initEntity(this, "USERS", {"tag":"context","attributes":{"id":"USERS","iscascade":"false","from-type":"context","filter":""},"fields":{"ishttps":{"tag":"field","attributes":{"id":"ishttps","type":"string"}},"userName":{"tag":"field","attributes":{"id":"userName","type":"string"}},"passWord":{"tag":"field","attributes":{"id":"passWord","type":"string"}}},"namespace":"com.yonyou.uap"});
}
function com$yonyou$uap$USERSEntity$get_userName(){
    return this.field('userName');
}
function com$yonyou$uap$USERSEntity$set_userName(value){
    return this.field('userName',value);
}
function com$yonyou$uap$USERSEntity$get_passWord(){
    return this.field('passWord');
}
function com$yonyou$uap$USERSEntity$set_passWord(value){
    return this.field('passWord',value);
}
function com$yonyou$uap$USERSEntity$get_ishttps(){
    return this.field('ishttps');
}
function com$yonyou$uap$USERSEntity$set_ishttps(value){
    return this.field('ishttps',value);
}
com.yonyou.uap.USERSEntity.prototype = {
    get_userName : com$yonyou$uap$USERSEntity$get_userName,
    set_userName : com$yonyou$uap$USERSEntity$get_userName,
    get_passWord : com$yonyou$uap$USERSEntity$get_passWord,
    set_passWord : com$yonyou$uap$USERSEntity$get_passWord,
    get_ishttps : com$yonyou$uap$USERSEntity$get_ishttps,
    set_ishttps : com$yonyou$uap$USERSEntity$get_ishttps
}
com.yonyou.uap.USERSEntity.registerClass('com.yonyou.uap.USERSEntity',UMP.UI.Mvc.Entity);
