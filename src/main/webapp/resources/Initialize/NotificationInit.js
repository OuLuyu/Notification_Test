function notifyMe() {
	  if (!("Notification" in window)) {
	    alert("This Browser can't used Notification");
	  }
	  else if (Notification.permission === "granted") {
	    var notification = new Notification("Hello world!");
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

function SendMessaging(){
	
}