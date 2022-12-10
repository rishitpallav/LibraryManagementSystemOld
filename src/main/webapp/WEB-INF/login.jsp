<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>LIBRARY MANAGEMENT SYSTEM APPLICATION</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <style>
            body {
                background-image: url('images/background.jpg');
                background-attachment: fixed;
                background-size: 100% 100%;
            }
        </style>
        <script>
            function login() {
                var userType = document.getElementById("userType").value;
                var email = document.getElementById("email").value;
                if (userType == "member") {

                    window.location.replace("/login/" + email);
                } else if (userType == "librarian") {
                    window.location.replace("/librarianLogin/" + email);
                } else {
                    alert("ERROR");
                }
            }
        </script>
    </head>

    <body>
        <br><br><br><br>
        <br><br><br><br>
        <br><br>
        <h1 style="text-align: center;">LOGIN</h1>
        <div style="display: block; width: 50%; margin: auto;">
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp">

                <div>
                    <label for="userType" class="form-label">Who are you?</label>
                    <br>
                    <select class="form-select" id="userType"
                        style="width: 100%; text-align: center; display: block; margin: auto;">
                        <option selected value="member">Member</option>
                        <option value="librarian">Librarian</option>
                    </select>
                </div>
                <br>
                <button type="submit" value="login" class="btn btn-primary"
                    style="width: 50%; text-align: center; display: block; margin: auto;"
                    onclick="login()">LOGIN</button>
                <br>
                <a href="/register" style="display: block; text-align: center;">DON'T HAVE AN ACCOUNT? CREATE HERE!</a>
            </div>
        </div>
        <footer style="position: absolute;bottom: 0;width: 100%;height: 2.5rem;">
            <div style="background-color: rgba(0, 0, 0, 0.2); text-align: center;">
                2022 Copyright:
                <a href="/">LIBRARY MANAGEMENT SYSTEM</a>
            </div>
        </footer>
        </div>
    </body>

    </html>