/**
 * Cordova Template Plugin
 */

var Template = (function () { 

  function Template() {
  }

  Template.prototype.echo = function (echoValue, successCallback) {
    cordova.exec(successCallback, function () { console.log('Error') }, 'Template', 'echo', [echoValue]);
  };
  Template.prototype.keya = function (successCallback) {
    cordova.exec(successCallback, function () { console.log('Error') }, 'Template', 'setFunctionKeyA');
  };


  return Template;

})();

var template = new Template();
module.exports = template;