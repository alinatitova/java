function signIn() {
    var login    = document.getElementById("login").value;
    var password = document.getElementById("password").value;

    if (login.length <= 0) {
        alert("Укажите логин!");
        return;
    }

    if (password.length <= 0) {
        alert("Укажите пароль!");
        return;
    }

    $.ajax({
        url: "http://localhost:8000/signin",
        type: "POST",
        data: JSON.stringify({
            login:    login,
            password: password
        }),
        success: function(data) {
            localStorage.setItem("token", data);
            window.location.href = "main.html";
        },
        error: function(err) {
            alert(err.responseText);
        }
    });
}