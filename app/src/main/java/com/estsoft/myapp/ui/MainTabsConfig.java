package com.estsoft.myapp.ui;

import android.os.Bundle;

import com.estsoft.myapp.R;
import com.estsoft.myapp.ui.tabs.*;
import com.estsoft.myapp.ui.user.UserListFragment;

public final class MainTabsConfig {

    private static final TabInfo[] TABINFOS = {
       new TabInfo( "접속자", R.drawable.ic_online, R.drawable.ic_online_selected, UserListFragment.class, null ),
       new TabInfo( "채팅", R.drawable.ic_chat, R.drawable.ic_chat_selected, UserListFragment.class, null ),
       new TabInfo( "더보기", R.drawable.ic_more, R.drawable.ic_more_selected, UserListFragment.class, null ),
       new TabInfo( "프로필", R.drawable.ic_profile, R.drawable.ic_profile_selected, UserListFragment.class, null )
                                      //          선택 X, O
    };

    public static final class TABINDEX {
       	public static final int USERLIST = 0;
       	public static final int CHANNELLIST = 1;
       	public static final int SETTINGS = 2;
       	
       	public static final int FIRST = 0;
       	public static final int LAST = TABINFOS.length;
    };
    
    public static final int COUNT_TABS() {
    	return TABINFOS.length;
    }
    
    public static final TabInfo TABINFO( int index ) {
    	return ( index < 0 || index >= COUNT_TABS() )  ? null : TABINFOS[ index ];
    }
    
    public static final class TabInfo {
		public final String tag;
		public final int drawableNormal;
		public final int drawableSelected;
        public final Class<?> klass;
        public final Bundle bundle;
        TabInfo( String tag, int drawableNormal, int drawableSelected, Class<?> klass, Bundle bundle ) {
            this.tag = tag;
            this.drawableNormal = drawableNormal;
            this.drawableSelected = drawableSelected;
            this.klass = klass;
            this.bundle = bundle;
        }
    }
}