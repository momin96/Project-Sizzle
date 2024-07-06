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
    @State private var validator = LoginValidator()

    var body: some View {
        VStack {
            TextField(AppConstants().placeholderEmail, text: $email)
                .onChange(of: email, perform: { newValue in
                    validator.resetError()
                    isValid = true
                })
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            SecureField(AppConstants().placeholderPassword, text: $password)
                .onChange(of: password, perform: { newValue in
                    validator.resetError()
                    isValid = true
                })
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            
            Button(AppConstants().buttonSignIn) {
                isValid = validator.validate(email: email, password: password)
            }
            .padding()
            
            if !isValid {
                validator.errorMessage.map {
                    Text($0)
                        .foregroundStyle(.red)
                }
            }
        }
        .padding()
    }
}

struct LoginView_Previews: PreviewProvider {
    static var previews: some View {
        LoginView()
    }
}
