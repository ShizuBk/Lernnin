package com.example.lernnin2.ui.cursos;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.lernnin2.R;
import com.example.lernnin2.databinding.FragmentCursosBinding;
import com.example.lernnin2.ui.lecciones.fb.CFb;


public class CursosFragment extends Fragment implements View.OnClickListener {
    public CursosFragment(){

    }

    Button btnCFb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceOf){
        return inflater.inflate(R.layout.fragment_cursos,container,false);

        View v;
        v = inflater.inflate(R.layout.fragment_fb,container,false);


    }


}
