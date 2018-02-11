var express = require("express");
var app = express();
var router = express.Router();

router.get('/', function(req, res){
	res.sendFile("index.html");
});

app.listen(3000, function (){
	console.log("Live at port " + 3000);
})
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
