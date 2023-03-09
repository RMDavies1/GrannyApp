package com.example.grannyapp
class Login {

    private var aName = ArrayList<String>()
    private var aPassword = ArrayList<String>()

    fun AddOldUsers()
    {
        aName.add("Granny")
        aPassword.add("Tim")
        aName.add("Grandpa")
        aPassword.add("Timmy")
        aName.add("Timmy")
        aPassword.add("Granny")
    }

    fun AddNewUser(Name:String, Password:String)
    {
        aName.add(Name)
        aPassword.add(Password)
    }
    fun CheckUser(Name:String, Password:String):Boolean
    {
        var bLoop = false
        for (i in 0.. aName.size)
        {
            if (aName[i].equals(Name) && aPassword[i].equals(Password))
            {
                bLoop = true
            }
        }
        return  bLoop
    }


}