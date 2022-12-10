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
            <form style="display: block; padding: 2%;" action="/addBook" method="POST">
                <div class="form-group">
                    <label for="book_id">BOOK ID</label>
                    <input type="number" class="form-control" name="book_id" id="book_id" placeholder="1001">
                </div>
                <div class="form-group">
                    <label for="bookTitle">BOOK TITLE</label>
                    <input type="text" class="form-control" name="bookTitle" id="bookTitle" placeholder="INTRODUCTION TO ALGORITHMS">
                </div>
                <div class="form-group">
                    <label for="copies">NO:OF COPIES AVILABLE</label>
                    <input type="number" class="form-control" name="copies" id="copies" placeholder="2">
                </div>
                <div class="form-group">
                    <label for="rack">Rack</label>
                    <input type="text" class="form-control" name="rack" id="rack" placeholder="G">
                </div>
                <div class="form-group">
                    <label for="floor">Floor</label>
                    <input type="number" class="form-control" name="floor" id="floor" placeholder="1">
                </div>
                <div class="form-group">
                    <label for="room">Room</label>
                    <input type="number" class="form-control" name="room" id="room" placeholder="105">
                </div>
                <div class="form-group">
                    <label for="authorId">AUTHOR ID</label>
                    <input type="number" class="form-control" name="authorId" id="authorId" placeholder="1001">
                    <small><a href="/addAuthor">NEW AUTHOR? ADD HERE</a></small>
                </div>
                <div class="form-group">
                    <label for="publisherId">PUBLISHER ID</label>
                    <input type="number" class="form-control" name="publisherId" id="publisherId" placeholder="1001">
                    <small><a href="/addPublisher">NEW PUBLISHER? ADD HERE</a></small>
                </div>
                <div class="form-group">
                    <label for="edition">EDITION</label>
                    <input type="number" class="form-control" name="edition" id="edition" placeholder="2">
                </div>
                <div class="form-group">
                    <label for="year">YEAR</label>
                    <input type="number" class="form-control" name="year" id="year" placeholder="2022">
                </div>

                <button type="submit" id="submit" class="btn btn-primary">ADD BOOK</button>
            </form>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>