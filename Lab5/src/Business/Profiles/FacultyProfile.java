/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Add core business models, profiles, and user account management
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author rithwikvarma
 */
public class FacultyProfile extends Profile  {
    public FacultyProfile(Person p) {
        super(p); // pass the Person to Profile
    }

    @Override
    public String getRole() {
        return "Faculty";
    }
}
