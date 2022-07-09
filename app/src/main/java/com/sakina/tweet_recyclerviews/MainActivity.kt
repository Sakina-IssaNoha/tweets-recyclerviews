package com.sakina.tweet_recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sakina.tweet_recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1=Tweets(" ","Sakina","22 hrs","Beauty and the beast, in love forever"," "," "," "," ","1.1k","563","875")
        var tweet2=Tweets(" ","Anisa","2 days","Love is a scam","430"," "," "," ","53","40","2")
        var tweet3=Tweets(" ","Mollen","24 hrs","Failing to plan is planning to fail"," "," "," "," ","5.7k","763","975")
        var tweet4=Tweets(" ","Joy","2 hrs","Happy are those who have money for they shall enjoy life"," "," "," "," ","230","63","30")
        var tweet5=Tweets(" ","Serah","16 hrs","Life is a beautiful thing but not everyone gets to experience it"," "," "," "," ","213","163","75")
        var tweet6=Tweets(" ","Sandy","10 hrs","Daavido's new album is amaizing and awesome"," "," "," "," ","147","80","52")
        var tweet7=Tweets(" ","Minaj","12 hrs","Kim Kardashian and North killed it at the balenciaga fashion show"," "," "," "," ","8.7k","1563","1875")
        var tweet8=Tweets(" ","Wanjy","13 hrs","Another day to study in the name of a better future"," "," "," "," ","900k","1963","978")

        var tweetsList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)

        var tweetsAdapter=TweetRvAdapter(tweetsList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetsAdapter
    }

}