const fs = require('fs');

fs.appendFile('./text-2.txt','\n\n새로운 내용 추가',(err)=>{
    if(err){
        console.log(err);
    }
    console.log("appending to file")
})