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

