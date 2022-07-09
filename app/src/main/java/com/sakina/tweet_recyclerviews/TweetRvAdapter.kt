package com.sakina.tweet_recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter(var tweets: List<Tweets>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.tweets_list_items,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweets =tweets.get(position)
        holder.tvName.text=currentTweets.name
        holder.tvTime.text = currentTweets.time
        holder.tvTweet.text=currentTweets.tweet
        holder.tvRetweet.text=currentTweets.retweet_no
        holder.tvComments.text=currentTweets.comments_no
        holder.tvLikes.text=currentTweets.likes

    }

    override fun getItemCount(): Int {
        return tweets.size

    }
}
class TweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var imgAvatar = itemView.findViewById<ImageView>(R.id.imgAvatar)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var imgComments = itemView.findViewById<ImageView>(R.id.imgComments)
    var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var tvRetweet = itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvComments = itemView.findViewById<TextView>(R.id.tvComments)
    var imgLikes = itemView.findViewById<ImageView>(R.id.imgLikes)
    var tvLikes = itemView.findViewById<TextView>(R.id.tvLikes)
    var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)
    var imgVerify = itemView.findViewById<ImageView>(R.id.imgVerify)
}