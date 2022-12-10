<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>LIBRARY MANAGEMENT SYSTEM APPLICATION</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <style>
            body {
                background-color: darkgray;
            }
        </style>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style="display: block; background-color: #212025;">
            <a style="float: left; width: 26%; padding: 10px; font-size: large; color: aliceblue;"
                href="/homepage">LIBRARY MANAGEMENT SYSTEM</a>
            <div
                style="float: left; width: 55%; padding: 10px; font-size: large; color: #212025; background-color: #212025;">
                <form action="/search" method="POST"><input type="text" name="searchText" id="searchText"
                        style="display: inline-block; width: 70%;" placeholder="Search Here"><input type="submit"
                        id="submit" style="display: inline-block;">
                </form>
            </div>
            <button
                style="float: right; width: 15%; padding: 10px; font-size: large; color: aliceblue; background-color: #212025;"
                onclick="window.location.href='/'">
                Logout</button>
        </nav>

        <h2 style="color: aliceblue;">Hi, ${currentMember.firstName}</h2>
        <br><br><br>
        <table class="table" style="display: block; margin: auto; width: 50%; text-align: center;">
            <tr>
                <td>
                    <button style="font-size: large; width: 600px; color: aliceblue; background-color: #212025;"
                        onclick="window.location.href='/UI/assignments.html'">VIEW ASSIGNMENTS</button>
                </td>
            </tr>
            <tr>
                <td>
                    <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;">EVENTS
                        TODAY</button>
                    <table class="table" style="background-color: lightgrey;">
                        <tr>
                            <td><a>TEAM MEETING - SOFTWARE ENGINEERING</a></td>
                        </tr>
                        <tr>
                            <td><a>HW #5 - SOFTWARE ENGINEERING</a></td>
                        </tr>
                        <tr>
                            <td><a>TEAM PROJECT - DATABASE ENGINEERING</a></td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;"
                        onclick="window.location.href='/UI/chats.html'">NEW MESSAGES</button>
                    <table class="table" style="background-color: lightgrey;">
                        <tr>
                            <td><a>ROBERT - Don't forget to submit today's ...</a></td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;"
                        onclick="window.location.href='/UI/search_jobs.html'">JOBS</button>
                </td>
            </tr>
        </table>
        <div>
            <footer style="position: absolute;bottom: 0;width: 100%;height: 2.5rem; background-color: #212025;">
                <div style="color: aliceblue; text-align: center;">
                    2022 Copyright:
                    <a href="/" style="color: aliceblue;">Student Application</a>
                </div>
            </footer>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>