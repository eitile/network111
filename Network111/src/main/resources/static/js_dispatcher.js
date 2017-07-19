function sendLoginInfo() {
    alert("yopta");
        $.ajax({
          type: "POST",
          url: "/login",
          data: JSON.stringify({
                'login': $('input[name="login"]').val(),
                'password': $('input[name="password"]').val()
          }),
          dataType: "json",
          contentType : "application/json; charset=UTF-8"
        });
     document.getElementById("loginForm").reset();
    }