function notifyMe() {
	  if (!("Notification" in window)) {
	    alert("This Browser can't used Notification");
	  }
	  else if (Notification.permission === "granted") {
		var option = {
				body: "Task #12 to done."
		}
	    var notification = new Notification("project : ezScrum",option);
	    
	  }
	  else if (Notification.permission !== 'denied') {
	    Notification.requestPermission(function (permission) {
	      if (permission === "granted") {
	        var notification = new Notification("Hello world!");
	      }
	    });
	  }
	}Notification.requestPermission();function spawnNotification(theBody,theIcon,theTitle) {
	  var options = {
	      body: theBody,
	      icon: theIcon
	  }
	  var n = new Notification(theTitle,options);
	}

// Initialize Firebase
var config = {
	apiKey: "AIzaSyAJJUz24w2bKfUqFNSTbelqyarDyvQ_cOE",
	authDomain: "test-219bd.firebaseapp.com",
	databaseURL: "https://test-219bd.firebaseio.com",
	projectId: "test-219bd",
	storageBucket: "test-219bd.appspot.com",
	messagingSenderId: "197046125774"
};
firebase.initializeApp(config);

var _token;

const messaging = firebase.messaging();
messaging.requestPermission()
.then(function(){
	console.log("Have permission");
	return messaging.getToken();
})
.then(function(token){
	console.log(token);
	_token = token;
})
.catch(function(err){
	console.log("Error Occured.");
});

messaging.onMessage(function(payload){
	var option = {
			body: payload.notification.body,
			icon: payload.notification.icon
	}
    var notification = new Notification(payload.notification.title,option);
	console.log('onMessage:', payload );
});

function SendMessaging(){
	var payload = {
			"to" : _token,
			"notification":{
				"title":"project : ezScrum",
				"body":"Task #12 to done.",
				"icon":"/icon/scrum_16.png"
			}
	}
	
	var xhttp = new XMLHttpRequest();
	xhttp.open("POST", "https://fcm.googleapis.com/fcm/send", true);
	xhttp.setRequestHeader('Content-Type', 'application/json');
	xhttp.setRequestHeader('Authorization', 'key=AAAALeDdRM4:APA91bHDg36wwcKhafIlP4A6eRpzFtqTL0MvjOQPYicW1wnoVClieKmGZeRNKABkqG3e4We0cGXnDBJ_zD2lWMI6BhFLL_NRlXmpYm8oZux5IoKiGauN7K9YJhc__xI4cW-BXl6AKlwd');
	xhttp.send(JSON.stringify(payload));
}