package com.example.auctionapplication.domain.auction.event;

import com.example.auctionapplication.domain.auction.Auction;
import org.springframework.context.ApplicationEvent;

public class AuctionCronBatchEvent extends ApplicationEvent {

    public AuctionCronBatchEvent(Iterable<Auction> source) {
        super(source);
    }

    @Override
    public Iterable<Auction> getSource(){
        return (Iterable<Auction>) source;
    }
}
