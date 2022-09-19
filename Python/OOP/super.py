from turtle import forward
import torch
import torch.nn as nn

class modeul(nn.Module):
    def __init__(self) -> None:
        super(modeul, self).__init__()
        self.conv1 = nn.Conv2d(3, 4, kernel_size=3, padding=0, stride=1)
    
    def forward(self, x):
        return self.conv1(x)

model = modeul()
input = torch.randn((1,3,32,32))
print(model(input).shape)

class SEUnit(nn.Sequential):
    def __init__(self, ch, norm_layer, r=16):
        super(SEUnit, self).__init__(
            nn.AdaptiveAvgPool2d(1), # squeeze
            # ConvNormAct(ch, ch//r, 1, norm_layer), nn.Conv2d(ch//r, ch, 1, bias=True), nn.Sigmoid(), # excitation
        )
    def forward(self, x):
        out = super(SEUnit, self).forward(x)
        return out * x