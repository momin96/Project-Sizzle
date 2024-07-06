import SwiftUI
import shared

struct ContentView: View {

	var body: some View {
        LoginView()
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
        LoginView()
	}
}

struct LoginView: View {
    @State private var email: String = ""
    @State private var password: String = ""
    @State private var isValid: Bool = true

    var body: some View {
        VStack {
            TextField("Email", text: $email)
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            SecureField("Password", text: $password)
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            Button("Sign In") {
                isValid = validateForm()
            }
            .padding()
            .background(isValid ? Color.green : Color.red)
            .foregroundColor(.white)
            .cornerRadius(10)
        }
        .padding()
    }

    func validateForm() -> Bool {
        let validator = LoginValidator()
        return validator.validateEmail(email: email) && validator.validatePassword(password: password)
    }
}

struct LoginView_Previews: PreviewProvider {
    static var previews: some View {
        LoginView()
    }
}
