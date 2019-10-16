package com.example.ecommerce.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ecommerce.OffersActivity;
import com.example.ecommerce.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.activity_offers, container, false);

       /* Intent intent=new Intent(getActivity(), OffersActivity.class);
        startActivity(intent);
        getActivity().finish();
        getActivity().getActionBar().setTitle("Offers");*/
        return root;
    }
}

