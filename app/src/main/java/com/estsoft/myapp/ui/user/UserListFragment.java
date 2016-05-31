package com.estsoft.myapp.ui.user;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estsoft.android.network.SafeAsyncTask;
import com.estsoft.myapp.R;
import com.estsoft.myapp.core.domain.User;
import com.estsoft.myapp.core.service.UserService;

import java.util.List;

/**
 * Created by bit-user on 2016-05-31.
 */
public class UserListFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        UserListAdapter adapter = new UserListAdapter( getActivity() );
        this.setListAdapter( adapter );

        return inflater.inflate( R.layout.fragment_user_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        new FetchUserListTask().execute();      // activity가 create 되는 순간에 통신이 시작
    }

    private class FetchUserListTask extends SafeAsyncTask<List<User>>{

        @Override
        public List<User> call() throws Exception {
            // 데이터 통신 후 , 결과를 리턴
            List<User> list = new UserService().fetchUserList();
            return list;
        }

        @Override
        protected void onException(Exception e) throws RuntimeException {
            // 통신 중 에러가 발생
            super.onException(e);
            Log.d("-->", e.toString());
        }

        @Override
        protected void onSuccess(List<User> list ) throws Exception {
            // call()메서드가 리턴 한 경우( 통신 성공한 경우 )
            // UI 업데이트
            ((UserListAdapter)getListAdapter()).add( list );
        }
    }
}
