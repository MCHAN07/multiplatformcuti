import UIKit
import shared  // Import modul shared (pastikan framework shared sudah di-build)

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()

        // Membuat button secara programatik
        let buttonHello = UIButton(type: .system)
        buttonHello.setTitle("Hello World", for: .normal)
        buttonHello.frame = CGRect(x: 0, y: 0, width: 200, height: 50)
        buttonHello.center = view.center
        buttonHello.addTarget(self, action: #selector(buttonTapped), for: .touchUpInside)

        view.addSubview(buttonHello)
    }

    @objc func buttonTapped() {
        // Panggil fungsi dari modul shared
        let message = CommonKt.getHelloWorld()

        // Tampilkan alert
        let alert = UIAlertController(title: "Hello", message: message, preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "OK", style: .default))
        self.present(alert, animated: true)
    }
}
