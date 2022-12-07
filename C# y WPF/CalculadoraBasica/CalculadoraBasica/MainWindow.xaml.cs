using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CalculadoraBasica
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    /// 
    
    public partial class MainWindow : Window
    {
        private bool chkSum;
        private bool chkResta;
        private bool chkMult;
        private bool chkDiv;

        public MainWindow()
        {
            InitializeComponent();
            txtRes.IsEnabled = false;
            btnCalcular.IsEnabled = false;
        }

        private void btnLimpiar_Click(object sender, RoutedEventArgs e)
        {
            txtOp1.Text = "";
            txtOp2.Text = "";
            txtRes.Text = "";

        }

        private void btnCalcular_Click(object sender, RoutedEventArgs e)
        {
            double op1 = double.Parse(txtOp1.Text);
            double op2 = double.Parse(txtOp2.Text);


            if (chkSum)
            {
                txtRes.Text = Convert.ToString(op1 + op2);
            }

            if (chkResta)
            {
                txtRes.Text = Convert.ToString(op1 - op2);
            }

            if (chkMult)
            {
                txtRes.Text = Convert.ToString(op1 * op2);
            }

            if (chkDiv) {
                if(op1 == 0 || op2 == 0) {
                    txtRes.Text = "Error";
                } else {
                    txtRes.Text = Convert.ToString(op1 / op2);
                }
                
            }
        }

        private void rbSum_Checked(object sender, RoutedEventArgs e)
        {
            checkChecked();
        }

        private void rbResta_Checked(object sender, RoutedEventArgs e)
        {
            checkChecked();
        }

        private void rbMult_Checked(object sender, RoutedEventArgs e)
        {
            checkChecked();
        }

        private void rbDiv_Checked(object sender, RoutedEventArgs e)
        {
            checkChecked();
        }

        private void btnSalir_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void checkChecked()
        {
            chkSum = (bool)rbSum.IsChecked;
            chkResta = (bool)rbResta.IsChecked;
            chkMult = (bool)rbMult.IsChecked;
            chkDiv = (bool)rbDiv.IsChecked;
        }

        private void txtOp1_TextChanged(object sender, TextChangedEventArgs e)
        {
            if ((txtOp1.Text.Equals("") || txtOp1.Text == null) || (txtOp2.Text.Equals("") || txtOp2.Text == null))
            {
                btnCalcular.IsEnabled = false;
            } else
            {
                btnCalcular.IsEnabled = true;
            }
        }

        private void txtOp2_TextChanged(object sender, TextChangedEventArgs e)
        {
            if ((txtOp2.Text.Equals("") || txtOp2.Text == null) || (txtOp1.Text.Equals("") || txtOp1.Text == null))
            {
                btnCalcular.IsEnabled = false;
            }
            else
            {
                btnCalcular.IsEnabled = true;
            }
        }
    }
}
