const http = require("http");
const fs = require("fs");

const port = 3000;
const hostname = "127.0.0.1";

fs.readFile("index.html", function (err, html) {
	if(err){
		throw err;
	}

	const server = http.createServer(function (req, res) {
		res.statusCode = 200;
		res.setHeader("Content-type", "text/html");
		res.write(html);
		res.end();
	});

	

});