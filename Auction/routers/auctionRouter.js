
const express = require('express');
const { Auction } = require('../Models/auction');
const router = express.Router();
const nodemailer = require("nodemailer");




 
router.get(`/`, async (req, res) =>{
    const List = await Auction.find();
    if(!List) {
        res.status(500).json({success: false})
    } 
    res.send(List);
}); 



router.post('/', async (req,res)=>{
    let auction = new Auction({
        description: req.body.description,
        starting_Bid: req.body.starting_Bid,
        category: req.body.category,
        product_name: req.body.product_name,
        sold: req.body.sold,
        date: req.body.date,
 
       })
       auction = await auction.save();

    if(!auction)
    return res.status(400).send('the auction cannot be created!')

    res.send(auction);

    const transporter = nodemailer.createTransport({
        service: "gmail",
        auth: {
          user: "applicationdeltacuisine@gmail.com",
          pass: "pphexfcjduvckjdv",
        },
      });
  
      const mailOptions = {
        from: "applicationdeltacuisine@gmail.com",
        to: "applicationdeltacuisine@gmail.com",
        subject: "Auction created",
        html: `
            <html>
              <body>
                <p>Admin,</p>
                 <p>Cher utilisateur un enchére est crée.</p>
              </body>
            </html>
          `,
      };
  
      transporter.sendMail(mailOptions, (error, info) => {
        if (error) {
          console.error("Error sending email:", error);
        } else {
          console.log("Email sent:", info.response);
        }
      });

});


router.get(`/get/count`, async (req, res) =>{
    const Count = await Auction.countDocuments()
    if(!Count) {
        res.status(500).json({success: false})
    } 
    res.send({
        AuctionCount: Count
    });
})



module.exports =router;