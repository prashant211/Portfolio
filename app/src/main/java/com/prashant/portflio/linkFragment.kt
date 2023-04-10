package com.prashant.portflio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class linkFragment : Fragment() {
    lateinit var linkedin: ImageView
    lateinit var instagram: ImageView
    lateinit var whatsapp: ImageView
    lateinit var github: ImageView
    lateinit var email: ImageView
    lateinit var resume:ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_link, container, false)
        linkedin = view.findViewById(R.id.linkedin)
        instagram = view.findViewById(R.id.instagram)
        whatsapp = view.findViewById(R.id.whatsapp)
        github = view.findViewById(R.id.github)
        email = view.findViewById(R.id.email)
        resume = view.findViewById(R.id.resume)
        linkedin.setOnClickListener {
            val openUrl = Intent(android.content.Intent.ACTION_VIEW)
            openUrl.data = Uri.parse("https://www.linkedin.com/in/prashant-patel-937682223/")
            startActivity(openUrl)
        }
        instagram.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.instagram.com/patel_shab_90/")
            startActivity(openURL)
        }
        whatsapp.setOnClickListener {
            val open = Intent(android.content.Intent.ACTION_VIEW)
            open.data = Uri.parse("https://wa.me/+919653729528?text=Hi,Is Any one  Available?")
            startActivity(open)
        }
        github.setOnClickListener {
            val opengithub = Intent(android.content.Intent.ACTION_VIEW)
            opengithub.data = Uri.parse("https://github.com/prashant211")
            startActivity(opengithub)
        }
        email.setOnClickListener {
            val openemail = Intent(android.content.Intent.ACTION_VIEW)
            openemail.data = Uri.parse("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox")
            startActivity(openemail)
        }
        resume.setOnClickListener {
            val openemail = Intent(android.content.Intent.ACTION_VIEW)
            openemail.data = Uri.parse("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox")
            startActivity(openemail)
        }
        return view
    }
}