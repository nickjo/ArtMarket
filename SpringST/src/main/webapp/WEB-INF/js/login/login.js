$(function(){
	
	// Load the SDK asynchronously
	(function(d, s, id) {
	    var js, fjs = d.getElementsByTagName(s)[0];
	    if (d.getElementById(id)) return;
	    js = d.createElement(s); js.id = id;
	    js.src = "//connect.facebook.net/en_US/sdk.js";
	    fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));
	
	// facebook 'Like', 'Share'
	fn_Facebook_likeShare();
});

/*******************************************
 * 페이스북 like, share 버튼 호출 api
 * *******************************************/
function fn_Facebook_likeShare(){
	window.fbAsyncInit = function() {
	    FB.init({
	      appId      : '149179602130000',
	      xfbml      : true,
	      version    : 'v2.5'
	    });
	  };
	  
	  FB.getLoginStatus(function(response) {
		    statusChangeCallback(response);
	  });
	 

	  /*(function(d, s, id){checkLoginState();
	     var js, fjs = d.getElementsByTagName(s)[0];
	     if (d.getElementById(id)) {return;}
	     js = d.createElement(s); js.id = id;
	     js.src = "//connect.facebook.net/en_US/sdk.js";
	     fjs.parentNode.insertBefore(js, fjs);
	   }(document, 'script', 'facebook-jssdk'));*/
};

// This is called with the results from from FB.getLoginStatus().
function statusChangeCallback(response) {
    console.log('statusChangeCallback');
    console.log(response);
    // The response object is returned with a status field that lets the
    // app know the current login status of the person.
    // Full docs on the response object can be found in the documentation
    // for FB.getLoginStatus().
    if (response.status === 'connected') {
      // Logged into your app and Facebook.
    	console.log(response.authResponse.accessToken);
    	fn_SuccessLogin();
      //testAPI();
      // 로그인 성공시 메인페이지로 이동
      //fn_moveMainpage();
    } else if (response.status === 'not_authorized') {
      // The person is logged into Facebook, but not your app.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    } else {
      // The person is not logged into Facebook, so we're not sure if
      // they are logged into this app or not.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    }
}

//This function is called when someone finishes with the Login
// Button.  See the onlogin handler attached to it in the sample
// code below.
function checkLoginState() {
  FB.getLoginStatus(function(response) {
    statusChangeCallback(response);
  });
}


// Here we run a very simple test of the Graph API after login is
// successful.  See statusChangeCallback() for when this call is made.
function testAPI() {
  console.log('Welcome!  Fetching your information.... ');
  FB.api('/me', function(response) {
    console.log('Successful login for: ' + response.name);
    document.getElementById('status').innerHTML =
      'Thanks for logging in, ' + response.name + '!';
  });
}

// 로그인 성공 후 처리
function fn_SuccessLogin(){
	console.log('SuccessLogin');
}

/*******************************************
 * 페이스북 로그인 버튼 클릭 이벤트
 * *******************************************/
function fn_FbLogin(){
	checkLoginState();
	
	console.log("fn_FbLogin");
	FB.api('/me', function(response){
		
	});
}

/*******************************************
 * 페이스북 로그인 성공 시 메인 페이지로 이동
 * *******************************************/
function fn_moveMainpage(){
	var frm = document.frm;
	frm.action = "main.do";
	frm.method = "post";
	frm.submit();
}