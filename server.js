var express = require("express");
var app = express();
var router = express.Router();

router.get('/', function(req, res){
	res.sendFile("index.html");
});

app.listen(3000, function (){
	console.log("Live at port " + 3000);
})