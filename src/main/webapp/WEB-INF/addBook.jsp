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
            style="display: block; margin: auto; width: 90%; background-color: #212025; color: aliceblue; border-radius: 2%;">
            <form style="display: block; padding: 2%;" action="/addBook" method="POST">
                <div class="form-group">
                    <label for="job_title">JOB TITLE</label>
                    <input type="text" class="form-control" id="job_title" placeholder="Sr. Java Developer">
                </div>
                <div class="form-group">
                    <label for="experience">MINIMUM JOB EXPERIENCE IN YEARS</label>
                    <input type="text" class="form-control" id="experience" placeholder="2">
                </div>
                <div class="form-group">
                    <label for="external_link">EXTERNAL URL</label>
                    <input type="text" class="form-control" id="external_link" placeholder="www.company.com/jobs">
                </div>
                <div class="form-group">
                    <label for="majors">PREFERRED MAJORS</label>
                    <select multiple class="form-control" id="majors">
                        <option>ALL</option>
                        <option>ARCHITECTURE</option>
                        <option>BIO TECHNOLOGY</option>
                        <option>BUSINESS</option>
                        <option>CHEMISTRY</option>
                        <option>COMPUTER SCIENCE</option>
                        <option>ELECTRONICS</option>
                        <option>MECHANICAL</option>
                        <option>HISTORY</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="description">DESCRIPTION OF THE JOB</label>
                    <textarea class="form-control" id="description" rows="3"></textarea>
                </div>
                <div class="form-group" style="display: block; width: 100%;">
                    <label for="files">ADDITIONAL FILES</label>
                    <input type="file" class="form-control-file" id="files">
                </div>
                <button type="submit" class="btn btn-primary">ADD JOB</button>
            </form>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>