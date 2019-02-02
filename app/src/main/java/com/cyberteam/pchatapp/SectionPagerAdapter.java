package com.cyberteam.pchatapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return  requestsFragment;

            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;

            case 2:
                FriendsFragment friendsFragment = new FriendsFragment();
                return  friendsFragment;

             default:
                 return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //to give title to the sections like Requeata , Chats and Friends
    public CharSequence getPageTitle(int position){

        switch (position){

            case 0:
                return "REQUESTS";

            case 1:
                return  "CHATS";

            case 2:
                return  "FRIENDS";

            default:
                return null;

        }
    }
}
