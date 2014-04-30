Type.registerNamespace('com.yonyou.uap');
com.yonyou.uap.USERS = function(id, entity, json) {
    //Step 1：call base method and initialize context object
    com.yonyou.uap.USERS.initializeBase(this,[id, entity, json]);
    
}
function com$yonyou$uap$USERS$get_userName(){
    return this.get('userName');
}
function com$yonyou$uap$USERS$set_userName(value){
    return this.set('userName',value);
}
function com$yonyou$uap$USERS$get_passWord(){
    return this.get('passWord');
}
function com$yonyou$uap$USERS$set_passWord(value){
    return this.set('passWord',value);
}
function com$yonyou$uap$USERS$get_ishttps(){
    return this.get('ishttps');
}
function com$yonyou$uap$USERS$set_ishttps(value){
    return this.set('ishttps',value);
}
com.yonyou.uap.USERS.prototype = {
    get_userName : com$yonyou$uap$USERS$get_userName,
    set_userName : com$yonyou$uap$USERS$get_userName,
    get_passWord : com$yonyou$uap$USERS$get_passWord,
    set_passWord : com$yonyou$uap$USERS$get_passWord,
    get_ishttps : com$yonyou$uap$USERS$get_ishttps,
    set_ishttps : com$yonyou$uap$USERS$get_ishttps
}
com.yonyou.uap.USERS.registerClass('com.yonyou.uap.USERS',UMP.UI.Mvc.Context);

