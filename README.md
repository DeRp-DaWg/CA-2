README will be changed into a proper "how-to"/explanation of the program/api, at some undefined time, for now, a short explanation of the program (to come):

(On the front end) The user will be presented with a few (2-4) different sort of jokes (per example: dad jokes, political jokes, fart jokes etc.) without knowing which is which, the user is presented with a question, "which is the dad joke" and has to pick out the joke, they believe to be the dad joke.

If the user is correct, they score a point, and is sent on to the next question, with new brand new jokes to boot, reusing is nice, but we ain't about that, in this case. But when the user answers incorrectly they will LOSE, and their score will be set to 0! The worst fate ever bestowed onto a single human ever! And if their score, at the time they lost, was higher than any of their previous scores, they will have set a new highscore, which is a nice little compensation, for getting the worst fate ever bestowed upon you.

If the user wants to, they can also go to the leaderboards/scoreboards/whatever-you-want-to-call-them-boards and see the top X players scores (X because you can set the amount yourself, from the frontend, so perhaps top 10 or top 100 or whatever your heart desires). As you might have already guessed, this leaderboard (we will go with this term for now) will contain the top X users that has gotten the best scores, to entice the user into spending a ridiculous amount of time into OUR program, to beat these scores, and when enough users do this, we will go for WORLD DOMINATION! But one quiz program at a time.

As a side note: Being presented with 2-4 jokes at a time, one could say, that this is the most fun quiz program and project ever developed, I'm not saying it, but some one might.

Here is a few REST endpoints, that is to be used for the program, for the curious:

1) http://onebrightcreation.com:8081/CA-2/api/jokes (get a few jokes, in a single api call)
2) http://onebrightcreation.com:8081/CA-2/api/info/highscores (gets the top X players, with the highest scores, for the leaderboards)
3) http://onebrightcreation.com:8081/CA-2/api/info (with a PUT request, to update the current user score. A boolean 'isCorrect' is send with it, if it's 'true' the score should increment, if it's 'false' the user has answered incorrect, and the score should reset (to 0))
ttp://onebrightcreation.com:8081/CA-2/api/user/create (makes a user, using a POST request, a 'username' and a 'password', quite simple)