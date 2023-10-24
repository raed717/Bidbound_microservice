
const mongoose = require('mongoose');

const AuctionSchema = new mongoose.Schema({
    description: {
        type: String,
     },
     starting_Bid: {
        type: String,
     },
     category: {
        type: String,
     },
    product_name: {
        type: String,
     },
     date: {
        type: String,
     },

    sold: {
        type: Boolean,
        default: false,
         
    },
 

     
   
});

AuctionSchema.virtual('id').get(function () {
    return this._id.toHexString();
});

AuctionSchema.set('toJSON', {
    virtuals: true,
});

exports.Auction = mongoose.model('Auction', AuctionSchema);
exports.AuctionSchema = AuctionSchema;
