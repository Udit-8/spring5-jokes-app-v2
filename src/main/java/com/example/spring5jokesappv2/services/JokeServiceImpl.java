package com.example.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    @Override
    public String getJokes() {
        return "Knock Knock! \n Who's there ? \n Your worst nightmare.";
    }
}
