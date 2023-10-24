
const express = require('express');
const { Auction } = require('../Models/auction');
const router = express.Router();



 
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