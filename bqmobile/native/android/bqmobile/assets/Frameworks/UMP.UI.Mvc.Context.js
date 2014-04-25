
Type.registerNamespace('UMP.UI.Mvc');
UMP.UI.Mvc.Context = function UMP$UI$Mvc$Context(id, entity, json){
	this._id = id;
	this.__entity = entity;//元数据结构	
	this.__json = json;//context的json数据，由原生传递过来
	this.__baseClass = "UMP.UI.Mvc.Context";//记录类型
	
	this._fields={};//存放Field类型对象的字段
	this._links = {};//存放Context类型Fieldset对象的字典
	
	this._rows =[];// 1条或N条, Entity[] data  该数组存放的是 Entity 类型	
	
	
	this._userDataKeys =[];//存放用户自定义数据Key
	
	this._events = {};
	this.__CONST_EVENT_ONCHANGE = "onchange";
	
	if(this.__entity)
		this._id = this.__entity.id();
		
	this._disposed = false;//标示Action结束后，context是否需要提交原生Container
}
function UMP$UI$Mvc$Context$entity(){
	return this.__entity;
}
function UMP$UI$Mvc$Context$json(json){
	if(json == undefined){
		return this.__json;
	}else{
		this.__json = json;
	}
}
function UMP$UI$Mvc$Context$id(val){
	if(val == undefined){
		return this._id;
	}else{
		this._id = val;
	}
	
}
function UMP$UI$Mvc$Context$getFields(){
	return this._fields;
}
function UMP$UI$Mvc$Context$field(id){
	return this._fields[id];
}
function UMP$UI$Mvc$Context$getlinks(){
	return this._links;
}
function UMP$UI$Mvc$Context$has(id){
    if(this._fields[id]!=null)
	    return true;
	return false
}

function UMP$UI$Mvc$Context$get(rowIndex, fieldName){
	if(fieldName == undefined){
		//只有一个参数的时候，理解为get(fieldName)的情况
		fieldName = rowIndex;
		return this.__getFieldValue(fieldName);
	}else{
		return this.__getRowFieldValue(rowIndex,fieldName);
	}
}
function UMP$UI$Mvc$Context$__getFieldValue(fieldName){
	var fd = this._fields[fieldName];
	
	if(fd instanceof UMP.UI.Mvc.Field)
		return fd.get();
	if(fd instanceof UMP.UI.Mvc.Context)
		return fd;
	
	//此时fd可能是undefined，或者是一个简单类型（用户自己新增的一个不存在Entity定义的字段）
	
	var has = false;
	for(var i=0,len = this._userDataKeys.length;i<len;i++){
		var akey = this._userDataKeys[i];
		if(fieldName == akey){
			has = true;
			break;
		}
	}
	
	var userValue = null;
	if(has){			
		userValue = this[fieldName];
	}		
	return userValue;
}
function UMP$UI$Mvc$Context$__getRowFieldValue(rowIndex, fieldName){
    //1、if field, return the field's value
		
	//var rows = this._fields[this.id()];
	var rows = this.rows();
	var ctxObj = rows[rowIndex];
	var oldValue = ctxObj.__getFieldValue(fieldName);	
    return oldValue;
}



function UMP$UI$Mvc$Context$set(rowIndex, fName, fValue){
	
	if(fValue == undefined){
		//2个参数的情况		
		this.__setFieldValue(rowIndex,fName);
	}else{
		//3个参数的情况
		this.__setRowFieldValue(rowIndex, fName, fValue);	
	}
}
function UMP$UI$Mvc$Context$__setFieldValue(fName, fValue, silent){
	if(!this.has(fName)){//此时有两种可能		
		if(this.__entity){
			//1、仅仅是context没有该字段，entity是有该字段的定义
			if(this.__entity.property(fName)){
				//动态创建context的field
				var newfield = new UMP.UI.Mvc.Field(fName, "", this.__entity.property(fName));		
				this.addField(fName, newfield);
			}else{
				//alert("set value Failed! try to set [" + fValue + "] to the Field["+fName+"], but not exist the field in the entity!");
				//this.addField(fName, fValue);
				this.addUserData(fName, fValue);
				return;
			}
		}else{
			//alert("set value Failed! try to set [" + fValue + "] to the Field["+fName+"], but no the field and no the entity!");
			//this.addField(fName, fValue);
			this.addUserData(fName, fValue);
			return;
		}
	}else{//一定是简单类型，非Field类型
	    var fd = this._fields[fName];
		if(!(fd instanceof UMP.UI.Mvc.Field)){
			this.addUserData(fName, fValue);
			return;
		}
	}
	var fd = this._fields[fName];	
	
	var oldValue = fd.get();
	if(oldValue==fValue)
		return;
		
	fd.set(fValue);	
	
	if(!silent){	
		var newValue = fd.get();
		var args = {
			context : this,		
			fieldName : fName,
			srcValue : fValue,
			oldValue : oldValue,
			value : newValue
		};
		this.fireEvent(this.__CONST_EVENT_ONCHANGE, fName, args);
	}
}

function UMP$UI$Mvc$Context$val(fName, fValue){
	if(fValue == undefined){		
		this.get(fName);		
	}else{
		this.set(fName, fValue);
	}
}
function UMP$UI$Mvc$Context$__setRowFieldValue(rowIndex, fName, fValue){
	
	//var rows = this._fields[this.id()];
	var rows = this._rows;
	var ctxObj = rows[rowIndex];
	var oldValue = ctxObj.get(fName);
	
	if(oldValue==fValue)
		return;
	
	ctxObj.__setFieldValue(fName,fValue,true);//静默赋值，无需触发change事件,由__setRowFieldValue触发
	var newValue = ctxObj.get(fName);	
	var args = {
	    context : this,
		rowIndex : rowIndex,
        fieldName : fName,
		srcValue : fValue,
		oldValue : oldValue,
		value : newValue
	};
	this.fireEvent(this.__CONST_EVENT_ONCHANGE, fName, args);
}

function UMP$UI$Mvc$Context$length(){
	if(this._rows)
		return this._rows.length;
	else
		return 0;
}
function UMP$UI$Mvc$Context$rows() {
    return this._rows;
}	
function UMP$UI$Mvc$Context$rowSelector() {
	return "ListViewSelector";
}

function UMP$UI$Mvc$Context$removeRow(index){
	this._rows.remove(index);
}
function UMP$UI$Mvc$Context$removeRow2(index){
    this._rows = this._rows.remove2(index);
}
/*
function UMP$UI$Mvc$Context$addRow(entity){
	this._rows.push(entity);
}
*/
function UMP$UI$Mvc$Context$addField(id, fieldObj){
	
	
	this._fields[id] = fieldObj;	
	//this._rows.push(fieldObj);
}
function UMP$UI$Mvc$Context$removeField(context){

}

function UMP$UI$Mvc$Context$addRow(json){
	var id = this.__entity.id();
	var newFieldSet = new UMP.UI.Mvc.Context(id, this.__entity);
	_$um$CRUD$loadFieldSet(newFieldSet, json, this.__entity);//entity.fields[k]是一个soline的定义  json[k]是一个数组
	
	this._rows.push(newFieldSet);
	//this._fields[id].push(newFieldSet);
}
function UMP$UI$Mvc$Context$addJSON(jsonRow){
    //通过json来增加一行数据
	var curJSON = this.unload();
	var array = curJSON[this.entity().id()];
	if(_$um$isArray(array)){
		array[array.length] = jsonRow;//新增一条记录		
		this.load(curJSON);//将json状态到context中
	}else{
		alert(this.id()+"不是一个json的Array");
	}
}
function UMP$UI$Mvc$Context$getUserDataKeys(){	
	return this._userDataKeys;
}
function UMP$UI$Mvc$Context$addUserData(ukey, udata){
	var has = false;
	for(var i=0,len = this._userDataKeys.length;i<len;i++){
		var akey = this._userDataKeys[i];
		if(ukey == akey){
			has = true;
			break;
		}
	}
	
	if(!has){
		this._userDataKeys.push(ukey);
	}
	this[ukey] = udata;
}

function UMP$UI$Mvc$Context$addLink(id,context){
	//this._fields[id] = context;	
	this.addField(id, context);
	//this._links[id] = context;
}
function UMP$UI$Mvc$Context$removeLink(contextID){
	this._links[contextID] = null;
	delete this._links[contextID];
}

function UMP$UI$Mvc$Context$params(){
	return this["parameter"];	
}

function UMP$UI$Mvc$Context$param(name){
	var paras = this.params();
	if(paras){
		return paras[name];
	}else{
		return null;
	}
}

function UMP$UI$Mvc$Context$load(json) {
	return _$um$CRUD$load(this, json, this.__entity);
}
function UMP$UI$Mvc$Context$unload(json) {
	return _$um$CRUD$Context2JSON(this);
}

function UMP$UI$Mvc$Context$dispose(){
	this._disposed = true;
}
function UMP$UI$Mvc$Context$restore(){
	this._disposed = false;
}

function UMP$UI$Mvc$Context$isDisposed(){
	return this._disposed;
}

//Event
function UMP$UI$Mvc$Context$attachEvent(eventName,fieldName,handler) {
    if(!this._events[eventName])
		this._events[eventName]={};
		
	if(!this._events[eventName][fieldName])	
		this._events[eventName][fieldName] = [];
		
	this._events[eventName][fieldName].push(handler);	
}
function UMP$UI$Mvc$Context$detachEvent(eventName,fieldName,handler) {	
	if(!this._events[eventName])
		return;
		
	var handlers = this._events[eventName][fieldName];
	
	if(!handlers) return;
	
	var index = -1;
	for(var i=0,len = handlers.length;i<len;i++){
		if(handlers[i] == handler){
			index = i;
			break;
		}
	}
	if(index >= 0){
		var removed = handlers.splice(index,1); //试一试 delete handlers[index]
		return removed;
	}else{
		alert("没有这样的handler:" +handler.toString());
	}
}
function UMP$UI$Mvc$Context$fireEvent(eventName, fieldName, args) {

	//1、触发元数据上的事件
	this.__entity.fireEvent(eventName, fieldName, args);
	
	//2、触发数据上的事件
	/*  Context本身是数据，不提供注册事件，在Context元数据中注册事件
    if(this._events[eventName]){
		var handlers = this._events[eventName][fieldName];
		if(handlers){
			for(var i=0,len=handlers.length;i<len;i++){
				var func = handlers[i];
				if(typeof args ==="undefined"){
					agrs = {
						"eventName":eventName,
						"fieldName":fieldName
					};
				}
				func(this,args);
			}
		}
	}
	*/
}	
	

UMP.UI.Mvc.Context.prototype = {
    entity: UMP$UI$Mvc$Context$entity,
	json: UMP$UI$Mvc$Context$json,
	
	id: UMP$UI$Mvc$Context$id,
	getFields: UMP$UI$Mvc$Context$getFields,
	fields: UMP$UI$Mvc$Context$getFields,
	field: UMP$UI$Mvc$Context$field,
	
	get: UMP$UI$Mvc$Context$get,
	set: UMP$UI$Mvc$Context$set,
	val: UMP$UI$Mvc$Context$val,
	
	length: UMP$UI$Mvc$Context$length,
	rows: UMP$UI$Mvc$Context$rows,
	rowSelector: UMP$UI$Mvc$Context$rowSelector,
	addRow: UMP$UI$Mvc$Context$addRow,
	addJSON: UMP$UI$Mvc$Context$addJSON,
	removeRow: UMP$UI$Mvc$Context$removeRow,
	removeRow2: UMP$UI$Mvc$Context$removeRow2,
	
	has: UMP$UI$Mvc$Context$has,
	
	addField: UMP$UI$Mvc$Context$addField,
	removeField: UMP$UI$Mvc$Context$removeField,
	
	getUserDataKeys: UMP$UI$Mvc$Context$getUserDataKeys,
	addUserData: UMP$UI$Mvc$Context$addUserData,

	addLink: UMP$UI$Mvc$Context$addLink,
	removeLink: UMP$UI$Mvc$Context$removeLink,
	
	//private method
	__getFieldValue: UMP$UI$Mvc$Context$__getFieldValue,
	__setFieldValue: UMP$UI$Mvc$Context$__setFieldValue,	
	__getRowFieldValue: UMP$UI$Mvc$Context$__getRowFieldValue,
	__setRowFieldValue: UMP$UI$Mvc$Context$__setRowFieldValue,
	
	params: UMP$UI$Mvc$Context$params,
	param: UMP$UI$Mvc$Context$param,//must not named [parameter] because of the parameter is context keyword
	
	
	load: UMP$UI$Mvc$Context$load,
	unload: UMP$UI$Mvc$Context$unload,
	
	dispose: UMP$UI$Mvc$Context$dispose,
	isDisposed: UMP$UI$Mvc$Context$isDisposed,
	restore: UMP$UI$Mvc$Context$restore,
	/*  Context本身是数据，不提供注册事件，在Context元数据中注册事件
	attachEvent: UMP$UI$Mvc$Context$attachEvent,
    detachEvent: UMP$UI$Mvc$Context$detachEvent,
	*/
	fireEvent: UMP$UI$Mvc$Context$fireEvent	
};
UMP.UI.Mvc.Context.registerClass('UMP.UI.Mvc.Context');

/*
var $$context=null;
var $UMP$CreateContextDefine = function (id, entity) {
	//1、创建Model
    var curModel = new UMP.UI.Mvc.Model(modelName);
	if(modelName =="CustomerSubmit")
	    $$CurrentModel = curModel;
	
	//2、根据Model元数据创建Fields
	var fieldsMD = modelMetaData["Fields"]
	for(var fieldID in fieldsMD){
		var fieldMD = fieldsMD[fieldID];
		if(fieldMD){
			//set包含了创建字段过程，同时将字段设置成元数据中该字段的默认值
			var kv = {};
			kv[fieldMD.id] = fieldMD.DefaultValue;
			curModel.set(kv);//kv == {FirstName:"my first"}
		}
	}
	
	$UMP$getMM().set(modelName, curModel);
};
*/
