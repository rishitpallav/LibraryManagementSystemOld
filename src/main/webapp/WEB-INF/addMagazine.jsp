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
                href="/librarianHomepage">LIBRARY MANAGEMENT SYSTEM</a>
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

        <section
            style="display: block; margin: auto; width: 50%; background-color: #212025; color: aliceblue; border-radius: 2%;">
            <form style="display: block; padding: 2%;" action="/addMagazine" method="POST">
                <div class="form-group">
                    <label for="magazineId">Magazine ID</label>
                    <input type="number" class="form-control" name="magazineId" id="magazineId" placeholder="2001">
                </div>
                <div class="form-group">
                    <label for="magazineName">Magazine Name</label>
                    <input type="text" class="form-control" name="magazineName" placeholder="Pinnacle Monthly">
                </div>
                <div class="form-group">
                    <label for="issueId">Issue ID</label>
                    <input type="text" class="form-control" name="issueId" placeholder="1,2,3">
                    <small><a href="/addMagazineIssue">NEW MAGAZINE ISSUE? ADD HERE</a></small>
                </div>

                <button type="submit" id="submit" class="btn btn-primary">ADD MAGAZINE</button>
            </form>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>