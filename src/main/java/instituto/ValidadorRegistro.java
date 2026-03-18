package instituto;
public class ValidadorRegistro {


    public boolean validarNombre(String nombre)
    {
        if (nombre==null || nombre.isEmpty())
        {
            return false;
        }
        return true;
    }


    public boolean validarPassword(String password)
    {
        if (password.isEmpty() || password.length()<8)
        {
            return false;
        }
        return true;
    }


    public boolean validarEmail(String email)
    {
        if (email==null)
        {
            return false;
        }
        return email.contains("@");
    }


    public boolean validadEdad(int edad)
    {
        if(edad<16)
        {
            return false;
        }
        return true;
    }
}

