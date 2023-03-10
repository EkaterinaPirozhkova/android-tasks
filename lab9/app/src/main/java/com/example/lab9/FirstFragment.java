package com.example.lab9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lab9.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(view1 -> NavHostFragment.findNavController
                (FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_SecondFragment));
        binding.button.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Hello Kitty!", Toast.LENGTH_SHORT).show();});
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}