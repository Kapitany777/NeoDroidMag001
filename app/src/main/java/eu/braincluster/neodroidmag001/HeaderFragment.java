package eu.braincluster.neodroidmag001;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import eu.braincluster.neodroidmag001.databinding.FragmentHeaderBinding;

public class HeaderFragment extends Fragment
{
    private FragmentHeaderBinding binding;

    public HeaderFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        binding = FragmentHeaderBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}