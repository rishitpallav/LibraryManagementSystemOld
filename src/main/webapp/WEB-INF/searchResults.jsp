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

        <section style="width: 95%; display: block; margin: auto;">
            <table class="table">
                <thead class="thead-dark">
                    <th>
                        <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;"
                            onclick="window.location.href='/UI/homepage.html'"><i class="bi bi-arrow-left-circle"></i>
                            BACK</button>
                    </th>
                    <th>
                        <button
                            style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;">JOBS</button>
                    </th>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <button
                                style="font-size: large; width: 100%; color : aliceblue; background-color: #212025;">
                                <i class="bi bi-filter-square"></i> FILTER
                            </button>
                        </td>
                        <td>
                            <form>
                                <div class="form-row align-items-center">
                                    <div class="col-auto" style="display: inline-block; width: 90%;">
                                        <label class="sr-only" for="inlineFormInput">Name</label>
                                        <input type="text" class="form-control mb-2" id="inlineFormInput"
                                            placeholder="Backend Engineer">
                                    </div>
                                    <div class="col-auto" style="display: inline-block;">
                                        <button type="submit" class="btn btn-primary mb-2">SEARCH</button>
                                    </div>
                                </div>
                            </form>
                        </td>
                    </tr>
                    <c:forEach var="searchList" items="${searchList}">
                        <tr style="background-color: aliceblue;">
                            <td style="width: 20%; align-items: center;">
                                <h3 style="color: #212025;"> ${searchList.title} </h3>
                            </td>
                            <td style="width: 80%; align-items: center;">
                                <p>${searchList.type}</p>
                                <p>${searchList.year}</p>
                                <p>${searchList.authors}</p>
                                <p>${searchList.available}</p>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>