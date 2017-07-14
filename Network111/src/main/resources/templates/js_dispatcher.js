function sendLoginInfo() {
    alert("yopta");
        $.ajax({
          type: "POST",
          url: "/login",
          data: {
                'login': $('input[name="login"]'),
                'password': $('input[name="password"]')
          },
          success: function(){},
          dataType: "json",
          contentType : "application/json"
        });
    }