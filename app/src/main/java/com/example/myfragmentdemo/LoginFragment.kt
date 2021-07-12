package com.example.myfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfragmentdemo.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.btnLogin.setOnClickListener(){
            val userName : String = binding.tvUserName.text.toString()
            val password : String = binding.tvPassword.text.toString()

            if(userName == "abc" && password == "123"){

                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionFragment)

            }else{
                Toast.makeText(context, "Invalid username or password", Toast.LENGTH_LONG).show()
            }

        }


        return binding.root
    }


}